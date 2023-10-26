import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Murilo 
 * @version 0.1 Alpha
 */

public class Mundo extends World
{
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    private GreenfootSound bgMusic = new GreenfootSound("Yamamoto- Ryu Theme STREET FIGHTER II.mp3");
        public void started()
    {
    bgMusic.playLoop();
    }
    
     public void stopped()
    {
    bgMusic.pause();
    }
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

    }
}

