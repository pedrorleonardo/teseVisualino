/**
 */
package arduino.util;

import arduino.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduino.ArduinoPackage
 * @generated
 */
public class ArduinoSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArduinoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArduinoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArduinoPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ArduinoPackage.ROBO:
      {
        Robo robo = (Robo)theEObject;
        T result = caseRobo(robo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.ACAO:
      {
        Acao acao = (Acao)theEObject;
        T result = caseAcao(acao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.TRANSICOES:
      {
        Transicoes transicoes = (Transicoes)theEObject;
        T result = caseTransicoes(transicoes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VIRAR_ESQUERDA:
      {
        Virar_Esquerda virar_Esquerda = (Virar_Esquerda)theEObject;
        T result = caseVirar_Esquerda(virar_Esquerda);
        if (result == null) result = caseCorpo(virar_Esquerda);
        if (result == null) result = caseAcoes_Predefinidas(virar_Esquerda);
        if (result == null) result = caseAcao(virar_Esquerda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.MOVER_FRENTE:
      {
        Mover_Frente mover_Frente = (Mover_Frente)theEObject;
        T result = caseMover_Frente(mover_Frente);
        if (result == null) result = caseCorpo(mover_Frente);
        if (result == null) result = caseAcoes_Predefinidas(mover_Frente);
        if (result == null) result = caseAcao(mover_Frente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.MOVER_TRAS:
      {
        Mover_Tras mover_Tras = (Mover_Tras)theEObject;
        T result = caseMover_Tras(mover_Tras);
        if (result == null) result = caseCorpo(mover_Tras);
        if (result == null) result = caseAcoes_Predefinidas(mover_Tras);
        if (result == null) result = caseAcao(mover_Tras);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VIRAR_DIREITA:
      {
        Virar_Direita virar_Direita = (Virar_Direita)theEObject;
        T result = caseVirar_Direita(virar_Direita);
        if (result == null) result = caseCorpo(virar_Direita);
        if (result == null) result = caseAcoes_Predefinidas(virar_Direita);
        if (result == null) result = caseAcao(virar_Direita);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.RODAR_ESQUERDA_TEMPO:
      {
        Rodar_Esquerda_Tempo rodar_Esquerda_Tempo = (Rodar_Esquerda_Tempo)theEObject;
        T result = caseRodar_Esquerda_Tempo(rodar_Esquerda_Tempo);
        if (result == null) result = caseCorpo_Modificavel(rodar_Esquerda_Tempo);
        if (result == null) result = caseAcoes_Modificaveis(rodar_Esquerda_Tempo);
        if (result == null) result = caseAcao(rodar_Esquerda_Tempo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.RODAR_DIREITA_TEMPO:
      {
        Rodar_Direita_Tempo rodar_Direita_Tempo = (Rodar_Direita_Tempo)theEObject;
        T result = caseRodar_Direita_Tempo(rodar_Direita_Tempo);
        if (result == null) result = caseCorpo_Modificavel(rodar_Direita_Tempo);
        if (result == null) result = caseAcoes_Modificaveis(rodar_Direita_Tempo);
        if (result == null) result = caseAcao(rodar_Direita_Tempo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.ACOES_PREDEFINIDAS:
      {
        Acoes_Predefinidas acoes_Predefinidas = (Acoes_Predefinidas)theEObject;
        T result = caseAcoes_Predefinidas(acoes_Predefinidas);
        if (result == null) result = caseAcao(acoes_Predefinidas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.ACOES_MODIFICAVEIS:
      {
        Acoes_Modificaveis acoes_Modificaveis = (Acoes_Modificaveis)theEObject;
        T result = caseAcoes_Modificaveis(acoes_Modificaveis);
        if (result == null) result = caseAcao(acoes_Modificaveis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.MOVER_FRENTE_TEMPO:
      {
        Mover_Frente_Tempo mover_Frente_Tempo = (Mover_Frente_Tempo)theEObject;
        T result = caseMover_Frente_Tempo(mover_Frente_Tempo);
        if (result == null) result = caseCorpo_Modificavel(mover_Frente_Tempo);
        if (result == null) result = caseAcoes_Modificaveis(mover_Frente_Tempo);
        if (result == null) result = caseAcao(mover_Frente_Tempo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.MOVER_TRAS_TEMPO:
      {
        Mover_Tras_Tempo mover_Tras_Tempo = (Mover_Tras_Tempo)theEObject;
        T result = caseMover_Tras_Tempo(mover_Tras_Tempo);
        if (result == null) result = caseCorpo_Modificavel(mover_Tras_Tempo);
        if (result == null) result = caseAcoes_Modificaveis(mover_Tras_Tempo);
        if (result == null) result = caseAcao(mover_Tras_Tempo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VIRAR_PARA_XGRAUS:
      {
        Virar_para_X_Graus virar_para_X_Graus = (Virar_para_X_Graus)theEObject;
        T result = caseVirar_para_X_Graus(virar_para_X_Graus);
        if (result == null) result = caseCabeca_Modificavel(virar_para_X_Graus);
        if (result == null) result = caseAcoes_Modificaveis(virar_para_X_Graus);
        if (result == null) result = caseAcao(virar_para_X_Graus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VIRAR_MAX_DRT:
      {
        Virar_Max_Drt virar_Max_Drt = (Virar_Max_Drt)theEObject;
        T result = caseVirar_Max_Drt(virar_Max_Drt);
        if (result == null) result = caseCabeca(virar_Max_Drt);
        if (result == null) result = caseAcoes_Predefinidas(virar_Max_Drt);
        if (result == null) result = caseAcao(virar_Max_Drt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VIRAR_MAX_ESQ:
      {
        Virar_Max_Esq virar_Max_Esq = (Virar_Max_Esq)theEObject;
        T result = caseVirar_Max_Esq(virar_Max_Esq);
        if (result == null) result = caseCabeca(virar_Max_Esq);
        if (result == null) result = caseAcoes_Predefinidas(virar_Max_Esq);
        if (result == null) result = caseAcao(virar_Max_Esq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.CENTRAR:
      {
        Centrar centrar = (Centrar)theEObject;
        T result = caseCentrar(centrar);
        if (result == null) result = caseCabeca(centrar);
        if (result == null) result = caseAcoes_Predefinidas(centrar);
        if (result == null) result = caseAcao(centrar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VIRAR_45_ESQ:
      {
        Virar_45_Esq virar_45_Esq = (Virar_45_Esq)theEObject;
        T result = caseVirar_45_Esq(virar_45_Esq);
        if (result == null) result = caseCabeca(virar_45_Esq);
        if (result == null) result = caseAcoes_Predefinidas(virar_45_Esq);
        if (result == null) result = caseAcao(virar_45_Esq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VIRAR_45_DRT:
      {
        Virar_45_Drt virar_45_Drt = (Virar_45_Drt)theEObject;
        T result = caseVirar_45_Drt(virar_45_Drt);
        if (result == null) result = caseCabeca(virar_45_Drt);
        if (result == null) result = caseAcoes_Predefinidas(virar_45_Drt);
        if (result == null) result = caseAcao(virar_45_Drt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.MOVER_ALEATORIAMENTE:
      {
        Mover_Aleatoriamente mover_Aleatoriamente = (Mover_Aleatoriamente)theEObject;
        T result = caseMover_Aleatoriamente(mover_Aleatoriamente);
        if (result == null) result = caseCorpo(mover_Aleatoriamente);
        if (result == null) result = caseAcoes_Predefinidas(mover_Aleatoriamente);
        if (result == null) result = caseAcao(mover_Aleatoriamente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LED:
      {
        LED led = (LED)theEObject;
        T result = caseLED(led);
        if (result == null) result = caseAcoes_Predefinidas(led);
        if (result == null) result = caseAcao(led);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VERDE:
      {
        Verde verde = (Verde)theEObject;
        T result = caseVerde(verde);
        if (result == null) result = caseLED(verde);
        if (result == null) result = caseAcoes_Predefinidas(verde);
        if (result == null) result = caseAcao(verde);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.TRICOLOR:
      {
        Tricolor tricolor = (Tricolor)theEObject;
        T result = caseTricolor(tricolor);
        if (result == null) result = caseLED(tricolor);
        if (result == null) result = caseAcoes_Predefinidas(tricolor);
        if (result == null) result = caseAcao(tricolor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LIGAR_LED_VERDE:
      {
        Ligar_LED_Verde ligar_LED_Verde = (Ligar_LED_Verde)theEObject;
        T result = caseLigar_LED_Verde(ligar_LED_Verde);
        if (result == null) result = caseVerde(ligar_LED_Verde);
        if (result == null) result = caseLED(ligar_LED_Verde);
        if (result == null) result = caseAcoes_Predefinidas(ligar_LED_Verde);
        if (result == null) result = caseAcao(ligar_LED_Verde);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.DESLIGAR_LED_VERDE:
      {
        Desligar_LED_Verde desligar_LED_Verde = (Desligar_LED_Verde)theEObject;
        T result = caseDesligar_LED_Verde(desligar_LED_Verde);
        if (result == null) result = caseVerde(desligar_LED_Verde);
        if (result == null) result = caseLED(desligar_LED_Verde);
        if (result == null) result = caseAcoes_Predefinidas(desligar_LED_Verde);
        if (result == null) result = caseAcao(desligar_LED_Verde);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LIGAR_INTERMITENCIA:
      {
        Ligar_Intermitencia ligar_Intermitencia = (Ligar_Intermitencia)theEObject;
        T result = caseLigar_Intermitencia(ligar_Intermitencia);
        if (result == null) result = caseVerde(ligar_Intermitencia);
        if (result == null) result = caseLED(ligar_Intermitencia);
        if (result == null) result = caseAcoes_Predefinidas(ligar_Intermitencia);
        if (result == null) result = caseAcao(ligar_Intermitencia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.DESLIGAR_INTERMITENCIA:
      {
        Desligar_Intermitencia desligar_Intermitencia = (Desligar_Intermitencia)theEObject;
        T result = caseDesligar_Intermitencia(desligar_Intermitencia);
        if (result == null) result = caseVerde(desligar_Intermitencia);
        if (result == null) result = caseLED(desligar_Intermitencia);
        if (result == null) result = caseAcoes_Predefinidas(desligar_Intermitencia);
        if (result == null) result = caseAcao(desligar_Intermitencia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.VARIAS_CORES:
      {
        Varias_Cores varias_Cores = (Varias_Cores)theEObject;
        T result = caseVarias_Cores(varias_Cores);
        if (result == null) result = caseTricolor(varias_Cores);
        if (result == null) result = caseLED(varias_Cores);
        if (result == null) result = caseAcoes_Predefinidas(varias_Cores);
        if (result == null) result = caseAcao(varias_Cores);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.UNICA_COR:
      {
        Unica_Cor unica_Cor = (Unica_Cor)theEObject;
        T result = caseUnica_Cor(unica_Cor);
        if (result == null) result = caseTricolor(unica_Cor);
        if (result == null) result = caseLED(unica_Cor);
        if (result == null) result = caseAcoes_Predefinidas(unica_Cor);
        if (result == null) result = caseAcao(unica_Cor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LIGAR_CORES_POLICIA:
      {
        Ligar_Cores_Policia ligar_Cores_Policia = (Ligar_Cores_Policia)theEObject;
        T result = caseLigar_Cores_Policia(ligar_Cores_Policia);
        if (result == null) result = caseVarias_Cores(ligar_Cores_Policia);
        if (result == null) result = caseTricolor(ligar_Cores_Policia);
        if (result == null) result = caseLED(ligar_Cores_Policia);
        if (result == null) result = caseAcoes_Predefinidas(ligar_Cores_Policia);
        if (result == null) result = caseAcao(ligar_Cores_Policia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LIGAR_CORES_ARCO_IRIS:
      {
        Ligar_Cores_Arco_Iris ligar_Cores_Arco_Iris = (Ligar_Cores_Arco_Iris)theEObject;
        T result = caseLigar_Cores_Arco_Iris(ligar_Cores_Arco_Iris);
        if (result == null) result = caseVarias_Cores(ligar_Cores_Arco_Iris);
        if (result == null) result = caseTricolor(ligar_Cores_Arco_Iris);
        if (result == null) result = caseLED(ligar_Cores_Arco_Iris);
        if (result == null) result = caseAcoes_Predefinidas(ligar_Cores_Arco_Iris);
        if (result == null) result = caseAcao(ligar_Cores_Arco_Iris);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LIGAR_AZUL:
      {
        Ligar_Azul ligar_Azul = (Ligar_Azul)theEObject;
        T result = caseLigar_Azul(ligar_Azul);
        if (result == null) result = caseUnica_Cor(ligar_Azul);
        if (result == null) result = caseTricolor(ligar_Azul);
        if (result == null) result = caseLED(ligar_Azul);
        if (result == null) result = caseAcoes_Predefinidas(ligar_Azul);
        if (result == null) result = caseAcao(ligar_Azul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LIGAR_VERDE:
      {
        Ligar_Verde ligar_Verde = (Ligar_Verde)theEObject;
        T result = caseLigar_Verde(ligar_Verde);
        if (result == null) result = caseUnica_Cor(ligar_Verde);
        if (result == null) result = caseTricolor(ligar_Verde);
        if (result == null) result = caseLED(ligar_Verde);
        if (result == null) result = caseAcoes_Predefinidas(ligar_Verde);
        if (result == null) result = caseAcao(ligar_Verde);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.LIGAR_VERMELHO:
      {
        Ligar_Vermelho ligar_Vermelho = (Ligar_Vermelho)theEObject;
        T result = caseLigar_Vermelho(ligar_Vermelho);
        if (result == null) result = caseUnica_Cor(ligar_Vermelho);
        if (result == null) result = caseTricolor(ligar_Vermelho);
        if (result == null) result = caseLED(ligar_Vermelho);
        if (result == null) result = caseAcoes_Predefinidas(ligar_Vermelho);
        if (result == null) result = caseAcao(ligar_Vermelho);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.DESLIGAR_COR:
      {
        Desligar_Cor desligar_Cor = (Desligar_Cor)theEObject;
        T result = caseDesligar_Cor(desligar_Cor);
        if (result == null) result = caseUnica_Cor(desligar_Cor);
        if (result == null) result = caseTricolor(desligar_Cor);
        if (result == null) result = caseLED(desligar_Cor);
        if (result == null) result = caseAcoes_Predefinidas(desligar_Cor);
        if (result == null) result = caseAcao(desligar_Cor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.DESLIGAR_CORES:
      {
        Desligar_Cores desligar_Cores = (Desligar_Cores)theEObject;
        T result = caseDesligar_Cores(desligar_Cores);
        if (result == null) result = caseVarias_Cores(desligar_Cores);
        if (result == null) result = caseTricolor(desligar_Cores);
        if (result == null) result = caseLED(desligar_Cores);
        if (result == null) result = caseAcoes_Predefinidas(desligar_Cores);
        if (result == null) result = caseAcao(desligar_Cores);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.ACOES_CONDICIONAIS:
      {
        Acoes_Condicionais acoes_Condicionais = (Acoes_Condicionais)theEObject;
        T result = caseAcoes_Condicionais(acoes_Condicionais);
        if (result == null) result = caseAcao(acoes_Condicionais);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = caseAcoes_Condicionais(while_);
        if (result == null) result = caseAcao(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseAcoes_Condicionais(if_);
        if (result == null) result = caseAcao(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.CONDICAO:
      {
        Condicao condicao = (Condicao)theEObject;
        T result = caseCondicao(condicao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.BUMPER_PRESSIONADO:
      {
        Bumper_Pressionado bumper_Pressionado = (Bumper_Pressionado)theEObject;
        T result = caseBumper_Pressionado(bumper_Pressionado);
        if (result == null) result = caseCondicao(bumper_Pressionado);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.DISTANCIA_INFRA_VERMELHOS:
      {
        Distancia_Infra_Vermelhos distancia_Infra_Vermelhos = (Distancia_Infra_Vermelhos)theEObject;
        T result = caseDistancia_Infra_Vermelhos(distancia_Infra_Vermelhos);
        if (result == null) result = caseCondicao(distancia_Infra_Vermelhos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.CORPO:
      {
        Corpo corpo = (Corpo)theEObject;
        T result = caseCorpo(corpo);
        if (result == null) result = caseAcoes_Predefinidas(corpo);
        if (result == null) result = caseAcao(corpo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.CORPO_MODIFICAVEL:
      {
        Corpo_Modificavel corpo_Modificavel = (Corpo_Modificavel)theEObject;
        T result = caseCorpo_Modificavel(corpo_Modificavel);
        if (result == null) result = caseAcoes_Modificaveis(corpo_Modificavel);
        if (result == null) result = caseAcao(corpo_Modificavel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.CABECA:
      {
        Cabeca cabeca = (Cabeca)theEObject;
        T result = caseCabeca(cabeca);
        if (result == null) result = caseAcoes_Predefinidas(cabeca);
        if (result == null) result = caseAcao(cabeca);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.CABECA_MODIFICAVEL:
      {
        Cabeca_Modificavel cabeca_Modificavel = (Cabeca_Modificavel)theEObject;
        T result = caseCabeca_Modificavel(cabeca_Modificavel);
        if (result == null) result = caseAcoes_Modificaveis(cabeca_Modificavel);
        if (result == null) result = caseAcao(cabeca_Modificavel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.INICIO:
      {
        Inicio inicio = (Inicio)theEObject;
        T result = caseInicio(inicio);
        if (result == null) result = caseAcao(inicio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.FIM:
      {
        Fim fim = (Fim)theEObject;
        T result = caseFim(fim);
        if (result == null) result = caseAcao(fim);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.PARAR:
      {
        Parar parar = (Parar)theEObject;
        T result = caseParar(parar);
        if (result == null) result = caseCorpo(parar);
        if (result == null) result = caseAcoes_Predefinidas(parar);
        if (result == null) result = caseAcao(parar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArduinoPackage.PARAR_TEMPO:
      {
        Parar_Tempo parar_Tempo = (Parar_Tempo)theEObject;
        T result = caseParar_Tempo(parar_Tempo);
        if (result == null) result = caseCorpo_Modificavel(parar_Tempo);
        if (result == null) result = caseAcoes_Modificaveis(parar_Tempo);
        if (result == null) result = caseAcao(parar_Tempo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Robo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Robo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRobo(Robo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcao(Acao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transicoes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transicoes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransicoes(Transicoes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virar Esquerda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virar Esquerda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirar_Esquerda(Virar_Esquerda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mover Frente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mover Frente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMover_Frente(Mover_Frente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mover Tras</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mover Tras</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMover_Tras(Mover_Tras object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virar Direita</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virar Direita</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirar_Direita(Virar_Direita object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rodar Esquerda Tempo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rodar Esquerda Tempo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRodar_Esquerda_Tempo(Rodar_Esquerda_Tempo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rodar Direita Tempo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rodar Direita Tempo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRodar_Direita_Tempo(Rodar_Direita_Tempo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acoes Predefinidas</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acoes Predefinidas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcoes_Predefinidas(Acoes_Predefinidas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acoes Modificaveis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acoes Modificaveis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcoes_Modificaveis(Acoes_Modificaveis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mover Frente Tempo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mover Frente Tempo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMover_Frente_Tempo(Mover_Frente_Tempo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mover Tras Tempo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mover Tras Tempo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMover_Tras_Tempo(Mover_Tras_Tempo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virar para XGraus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virar para XGraus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirar_para_X_Graus(Virar_para_X_Graus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virar Max Drt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virar Max Drt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirar_Max_Drt(Virar_Max_Drt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virar Max Esq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virar Max Esq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirar_Max_Esq(Virar_Max_Esq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Centrar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Centrar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCentrar(Centrar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virar 45 Esq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virar 45 Esq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirar_45_Esq(Virar_45_Esq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virar 45 Drt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virar 45 Drt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirar_45_Drt(Virar_45_Drt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mover Aleatoriamente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mover Aleatoriamente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMover_Aleatoriamente(Mover_Aleatoriamente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LED</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLED(LED object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verde</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verde</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerde(Verde object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tricolor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tricolor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTricolor(Tricolor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ligar LED Verde</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ligar LED Verde</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLigar_LED_Verde(Ligar_LED_Verde object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desligar LED Verde</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desligar LED Verde</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesligar_LED_Verde(Desligar_LED_Verde object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ligar Intermitencia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ligar Intermitencia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLigar_Intermitencia(Ligar_Intermitencia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desligar Intermitencia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desligar Intermitencia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesligar_Intermitencia(Desligar_Intermitencia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Varias Cores</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Varias Cores</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarias_Cores(Varias_Cores object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unica Cor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unica Cor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnica_Cor(Unica_Cor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ligar Cores Policia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ligar Cores Policia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLigar_Cores_Policia(Ligar_Cores_Policia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ligar Cores Arco Iris</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ligar Cores Arco Iris</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLigar_Cores_Arco_Iris(Ligar_Cores_Arco_Iris object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ligar Azul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ligar Azul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLigar_Azul(Ligar_Azul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ligar Verde</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ligar Verde</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLigar_Verde(Ligar_Verde object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ligar Vermelho</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ligar Vermelho</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLigar_Vermelho(Ligar_Vermelho object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desligar Cor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desligar Cor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesligar_Cor(Desligar_Cor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desligar Cores</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desligar Cores</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesligar_Cores(Desligar_Cores object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acoes Condicionais</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acoes Condicionais</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcoes_Condicionais(Acoes_Condicionais object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condicao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condicao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondicao(Condicao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bumper Pressionado</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bumper Pressionado</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBumper_Pressionado(Bumper_Pressionado object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distancia Infra Vermelhos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distancia Infra Vermelhos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistancia_Infra_Vermelhos(Distancia_Infra_Vermelhos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Corpo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Corpo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCorpo(Corpo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Corpo Modificavel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Corpo Modificavel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCorpo_Modificavel(Corpo_Modificavel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cabeca</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cabeca</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCabeca(Cabeca object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cabeca Modificavel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cabeca Modificavel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCabeca_Modificavel(Cabeca_Modificavel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inicio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inicio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInicio(Inicio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fim</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fim</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFim(Fim object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParar(Parar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parar Tempo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parar Tempo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParar_Tempo(Parar_Tempo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ArduinoSwitch
