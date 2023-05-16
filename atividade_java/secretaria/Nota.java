package secretaria;

public class Nota {

    float notas;

    /** classe para pegar a nota */
    public void setNotas(float notas){
        if (notas >= 0.0 && notas <= 10.0){
            this.notas = notas;
        } else {
            System.out.println("nota invalida!");
        }
    }
    /** classe get nota */
    public float getNota(){
        return notas;
    }
}
