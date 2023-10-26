import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TelaInicial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class TelaInicial.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    public void act(){

        if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            setBackground(new GreenfootImage("1.jpg"));
            atraso++;
        }
        else{
            if (Greenfoot.isKeyDown("enter")){
                atraso=0;
            }
        }

          if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            setBackground(new GreenfootImage(""));
            atraso++;
        }
        else{
            if (Greenfoot.isKeyDown("enter")){
                atraso=0;
            }
        }
        
         if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            Mundo world = new Mundo();
            Greenfoot.setWorld(world);
            atraso++;
        }
        else{
            if (Greenfoot.isKeyDown("enter")){
                atraso=0;
            }
        }
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}