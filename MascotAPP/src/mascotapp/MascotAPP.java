package mascotapp;

import java.util.ArrayList;


public class MascotAPP {

   
    public static void main(String[] args) {
          //creo el Array
        String[] nombresArrays = new String[5];
      
        //llenado de forma dinamica
        for (int i = 0; i < nombresArrays.length; i++) {
            //nombre de perros llamados chiquitos
           nombresArrays[i] = "chiquito " + (i + 1); 
        }
        //muestro por pantalla lo que está dentro del Array
        for (String var : nombresArrays) {
            System.out.println(var);
        }
        
        //Collections
        //creacion e instanciacion
        
       ArrayList<String> nombresArrayList = new ArrayList();
       
       nombresArrayList.add("chiquito");
       nombresArrayList.add("pepito");
       nombresArrayList.add("danger");
       
       System.out.println(nombresArrayList.size());
       nombresArrayList.remove("chiquito");
       System.out.println(nombresArrayList.size());
    }
    
}
