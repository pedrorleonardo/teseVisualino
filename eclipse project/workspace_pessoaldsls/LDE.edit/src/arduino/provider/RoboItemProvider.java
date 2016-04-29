/**
 */
package arduino.provider;


import arduino.ArduinoFactory;
import arduino.ArduinoPackage;
import arduino.Robo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arduino.Robo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoboItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addNomePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Nome feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNomePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Robo_Nome_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Robo_Nome_feature", "_UI_Robo_type"),
         ArduinoPackage.Literals.ROBO__NOME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(ArduinoPackage.Literals.ROBO__TEM_ACOES);
      childrenFeatures.add(ArduinoPackage.Literals.ROBO__TEM_TRANSICOES);
      childrenFeatures.add(ArduinoPackage.Literals.ROBO__TEM_CONDICOES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Robo.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Robo"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((Robo)object).getNome();
    return label == null || label.length() == 0 ?
      getString("_UI_Robo_type") :
      getString("_UI_Robo_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Robo.class))
    {
      case ArduinoPackage.ROBO__NOME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case ArduinoPackage.ROBO__TEM_ACOES:
      case ArduinoPackage.ROBO__TEM_TRANSICOES:
      case ArduinoPackage.ROBO__TEM_CONDICOES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createVirar_Esquerda()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createMover_Frente()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createMover_Tras()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createVirar_Direita()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createRodar_Esquerda_Tempo()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createRodar_Direita_Tempo()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createMover_Frente_Tempo()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createMover_Tras_Tempo()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createVirar_para_X_Graus()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createVirar_Max_Drt()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createVirar_Max_Esq()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createCentrar()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createVirar_45_Esq()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createVirar_45_Drt()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createMover_Aleatoriamente()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createLigar_LED_Verde()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createDesligar_LED_Verde()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createLigar_Intermitencia()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createDesligar_Intermitencia()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createLigar_Cores_Policia()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createLigar_Cores_Arco_Iris()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createLigar_Azul()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createLigar_Verde()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createLigar_Vermelho()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createDesligar_Cor()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createDesligar_Cores()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createWhile()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createIf()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createInicio()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createFim()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createParar()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_ACOES,
         ArduinoFactory.eINSTANCE.createParar_Tempo()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_TRANSICOES,
         ArduinoFactory.eINSTANCE.createTransicoes()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_CONDICOES,
         ArduinoFactory.eINSTANCE.createBumper_Pressionado()));

    newChildDescriptors.add
      (createChildParameter
        (ArduinoPackage.Literals.ROBO__TEM_CONDICOES,
         ArduinoFactory.eINSTANCE.createDistancia_Infra_Vermelhos()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return ArduinoEditPlugin.INSTANCE;
  }

}
