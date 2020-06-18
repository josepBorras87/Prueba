package com.scjp.pruebas.miProyectoParaSCJP.ClaseMainPruebasDeExcepciones;
//Las subclases deben preceder a las superclases
//en las declaraciones catch
public class DobleCatch {
    public static void main(String[] args) {
        //Aquí, num es más grande que denom
        int nums[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};
        for (int i=0;i< nums.length;i++){
            try {
                System.out.println(nums[i]+" / "+
                                    denom[i]+" es "+nums[i]/denom[i]);;
            }catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("No se encontró ningún elemento.");
            }
            catch (Throwable exc){
            System.out.println("Alguna excepción ocurrió.");
            }
        }
    }
}
