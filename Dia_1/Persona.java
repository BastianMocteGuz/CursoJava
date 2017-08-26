public class Persona{
  String nombre;
  String sexo;
  int edad;

  public void caminar(){
    System.out.println(nombre + " esta caminando");
  }

  public void comer(){
    System.out.println(nombre + " esta comiendo");
  }

  public void estudiar(){
    System.out.println(nombre + " esta estudiando");
  }

  public void comer(String comida){
    System.out.println(nombre + " esta comiendo " + comida);
  }

  public void pedirCerveza(){
    if (edad >= 18)
      System.out.println("Salud!");
    else
      System.out.println("Lo siento " + nombre + ", eres menor de edad :'(");
  }
}

class Curso{
  public static void main(String[] args)
  {
    Persona bastian = new Persona();
    bastian.nombre = "Sebastian Moctezuma";
    bastian.sexo = "Masculino";
    bastian.edad = 24;

    bastian.caminar();
    bastian.estudiar();
    bastian.comer();
    bastian.comer("Quesadillas con Queso");
    bastian.pedirCerveza();

    Persona abi = new Persona();
    abi.nombre = "Abigail";
    abi.sexo = "Femenino";
    abi.edad = 17;

    abi.caminar();
    abi.estudiar();
    abi.comer();
    abi.pedirCerveza();
  }
}
