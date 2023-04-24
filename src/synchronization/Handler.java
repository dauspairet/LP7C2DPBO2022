// Saya Muhamad Firdaus [2101995] mengerjakan
// soal Latihan Praktikum 7 dalam mata kuliah DPBO
// untuk keberkahanNya maka saya tidak melakukan kecurangan 
// seperti yang telah dispesifikasikan. Aamiin.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Satria Ramadhani
 */
public class Handler implements GameInterface
{
    /**
     * Attribute declaration.
     */
    
    private ArrayList<GameObject> object; // Array / List of GameObject.
    private Random rand;                  // Randomizer.
    int bonusScore;                       // Marker for bonus score 
    
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Handler()
    {
        this.object = new ArrayList<>();
        this.rand = new Random();
    }

    public void setBonusScore(int bonusScore) {
        this.bonusScore = bonusScore;
    }
    
    /**
     * Object access and manipulations.
     */
    
    // Add object to list.
    public void add(GameObject object)
    {
        this.object.add(object);
    }
    
    // Access object from list.
    public GameObject get(int i)
    {
        return this.object.get(i);
    }
    
    // Count total object on list.
    public int count()
    {
        return this.object.size();
    }
    
    // Remove object from list based on its index.
    public void remove(int i)
    {
        this.object.remove(i);
    }
    
    // Remove object from list.
    public void remove(GameObject object)
    {
        this.object.remove(object);
    }
    
    public void collision(GameObject player, GameObject bonus) {
        // if there's a collision
        if (checkCollision(player, bonus)) {
            // randomize location with the current boundary
            bonus.setX(rand.nextInt(Game.width - 50));
            bonus.setY(rand.nextInt(Game.height - 70));
            
            // Mark bonus score
            setBonusScore(1);
        }
    }

    // Check if there's a collision
    private boolean checkCollision(GameObject obj1, GameObject obj2) {
        // If there''s no collision
        if (obj2 == null) {
            return false;
        }
        
        // If there's a collision
        if (obj1.getX() + obj1.getWidth() >= obj2.getX() && obj1.getX() <= obj2.getX() + obj2.getWidth() &&
            obj1.getY() + obj1.getHeight() >= obj2.getY() && obj1.getY() <= obj2.getY() + obj2.getHeight()) {
            return true;
        }
        return false;
    }
    
    /**
     * 
     * Override interface.
     */
    
    @Override
    public void render(Graphics g)
    {
        for(int i = 0; i < object.size(); i++)
        {
            GameObject temp;
            temp = object.get(i);
            
            temp.render(g);
        }
    }
    
    @Override
    public void loop()
    {
        for(int i = 0; i < object.size(); i++)
        {
            GameObject temp;
            temp = object.get(i);
            
            temp.loop();
        }
    }
}
