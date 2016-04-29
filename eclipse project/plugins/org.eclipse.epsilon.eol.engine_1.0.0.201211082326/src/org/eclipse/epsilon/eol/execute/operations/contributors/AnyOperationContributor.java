/*******************************************************************************
 * Copyright (c) 2012 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.eol.execute.operations.contributors;

import org.eclipse.epsilon.eol.exceptions.EolIllegalPropertyException;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.eol.execute.introspection.IUndefined;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.types.EolCollectionType;
import org.eclipse.epsilon.eol.types.EolPrimitiveType;
import org.eclipse.epsilon.eol.types.EolType;

public class AnyOperationContributor extends OperationContributor {
	
	@Override
	public boolean contributesTo(Object target) {
		return true;
	}
	
	public Object type() {
		
		if (EolPrimitiveType.String.isType(target)){
			return EolPrimitiveType.String;
		}
		else if (EolPrimitiveType.Boolean.isType(target)){
			return EolPrimitiveType.Boolean;
		}
		else if (EolPrimitiveType.Real.isType(target)){
			return EolPrimitiveType.Real;
		}
		else if (EolPrimitiveType.Integer.isType(target)){
			return EolPrimitiveType.Integer;
		}
		else if (EolCollectionType.Bag.isType(target)){
			return EolCollectionType.Bag;
		}
		else if (EolCollectionType.Sequence.isType(target)){
			return EolCollectionType.Sequence;
		}
		else if (EolCollectionType.Set.isType(target)){
			return EolCollectionType.Set;
		}
		else if (EolCollectionType.OrderedSet.isType(target)){
			return EolCollectionType.OrderedSet;
		}
		
		IModel model = context.getModelRepository().getOwningModel(target);
		if (model != null){
			return model.getTypeOf(target);
		}
		
		return null;
	}
	
	public String id() throws Exception {
		IModel model = context.getModelRepository().getOwningModel(target);
		if (model != null) {
			return model.getElementId(target);
		}
		//}
		else {
			throw new EolRuntimeException(context.getPrettyPrinterManager().print(target) + " is not a model element");
		}
	}
	
	public boolean instanceOf(EolType type) {
		return isKindOf(type);
	}
	
	public boolean isTypeOf(EolType type) {
		return type.isType(target);
	}
	
	public boolean isKindOf(EolType type) {
		return type.isKind(target);
	}
	
	public Class getNativeType() {
		return target.getClass();
	}
	
	public Class nativeType() {
		return getNativeType();
	}
	
	public IModel getOwningModel() {
		return owningModel();
	}
	
	public IModel owningModel() {
		return context.getModelRepository().getOwningModel(target);
	}
	
	public boolean hasProperty(String property) throws Exception {
		
		IPropertyGetter getter = context.getIntrospectionManager().getPropertyGetterFor(target, property, context);
		
		try {
			getter.invoke(target, property);
		}
		catch (EolIllegalPropertyException pex){
			return false;
		}
		
		return true;
	}
	
	public String asString() {
		return context.getPrettyPrinterManager().print(target);
	}
	
	public boolean isDefined() {
		if (target == null || target instanceof IUndefined) {
			return false ;
		}
		else if (target instanceof String && (((String) target).length() == 0)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isUndefined() {
		return !isDefined();
	}
	
	public Object ifUndefined(Object alternative) {
		if (isUndefined()) return alternative;
		else return target;
	}
	
	public Object println() {
		return println("", "");
	}
	
	public Object println(String prefix) {
		return println(prefix, "");
	}
	
	public Object println(String prefix, String suffix) {
		context.getOutputStream().
			println(prefix + context.getPrettyPrinterManager().print(target) + suffix);
		return target;
	}
	
	public Object print() {
		return print("", "");
	}
	
	public Object print(String prefix) {
		return print(prefix, "");
	}
	
	public Object print(String prefix, String suffix) {
		context.getOutputStream().
			print(prefix + context.getPrettyPrinterManager().print(target) + suffix);
		return target;
	}
	
	public Object err() {
		return err("", "");
	}
	
	public Object err(String prefix) {
		return err(prefix, "");
	}
	
	public Object err(String prefix, String suffix) {
		context.getErrorStream().
			print(prefix + context.getPrettyPrinterManager().print(target) + suffix);
		return target;
	}
	
	public Object errln() {
		return errln("", "");
	}
	
	public Object errln(String prefix) {
		return errln(prefix, "");
	}
	
	public Object errln(String prefix, String suffix) {
		context.getErrorStream().
			println(prefix + context.getPrettyPrinterManager().print(target) + suffix);
		return target;
	}
	
	public String format(String formatString) {
		return String.format(formatString, target);
	}
}
