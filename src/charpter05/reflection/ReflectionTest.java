package charpter05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {

        //read class name from command line args or user input
        String name;
        if(args.length>0){ name =args[0];}
        else{
            Scanner in=new Scanner(System.in);
            System.out.println("Enter class name (e.g java.util.Date)");
            name=in.next();
        }

        //print class name and supperClass name if(!=Object)
        try {
            Class cl=Class.forName(name);
            Class superClass=cl.getSuperclass();
            String modifers= Modifier.toString(cl.getModifiers());
            if(modifers.length()>0) System.out.print(modifers+" ");
            System.out.print("class "+name);
            if( null!=superClass && superClass!=Object.class)
                System.out.print(" extends "+superClass.getName());

            System.out.println("\n {\n");
            printConstructors(cl);
            printMethods(cl);
            printFields(cl);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }

    public static void printConstructors(Class cl){

        Constructor[] constructors=cl.getDeclaredConstructors();
        for (Constructor c:constructors){
            String name=c.getName();
            System.out.print(" ");
            String modifiers=Modifier.toString(c.getModifiers());
            if(modifiers.length()>0){
                System.out.print(modifiers+" ");
            }
            System.out.print(name+"(");

            //print parameter types
            Class[] paramTypes =c.getParameterTypes();
            for (int j=0; j<paramTypes.length;j++){
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     * @param cl  a class
     */
    public static void printMethods(Class cl){

        Method[] methods=cl.getMethods();
        for(Method m:methods){
            Class retType=m.getReturnType();
            String name=m.getName();

            //print modifiers, return type and method name
            String modifiers=Modifier.toString(m.getModifiers());
            if(modifiers.length()>0){
                System.out.print(modifiers+" ");
            }
            System.out.print(retType.getName()+" "+name+"(");

            //print parameter types
            Class[] parameterTypes=m.getParameterTypes();
            for(int i=0;i<parameterTypes.length;i++){
                if(i>0){
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all fields of a class
     * @param cl a class
     */
    public static void printFields(Class cl){
        Field[] fields=cl.getDeclaredFields();
        for(Field f:fields){
            Class type=f.getType();
            String name=f.getName();
            System.out.print(" ");
            String modifiers=Modifier.toString(f.getModifiers());
            if(modifiers.length()>0){
                System.out.print(modifiers+" ");
            }
            System.out.println(type.getName()+" "+name+";");
        }

    }


}
