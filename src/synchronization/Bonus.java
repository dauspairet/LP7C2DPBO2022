// Saya Muhamad Firdaus [2101995] mengerjakan
// soal Latihan Praktikum 7 dalam mata kuliah DPBO
// untuk keberkahanNya maka saya tidak melakukan kecurangan 
// seperti yang telah dispesifikasikan. Aamiin.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Firdaus
 */
public class Bonus extends GameObject {
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Bonus()
    {
        super(0, 0, "Bonus");
        super.setHeight(15);
        super.setWidth(15);
    }
    
    // Constructor with object position.
    public Bonus(int x, int y)
    {
        super(x, y, "Bonus");
        super.setHeight(15);
        super.setWidth(15);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set object shape.
        object.setColor(Color.YELLOW);
        object.fillRect(x, y, 45, 45);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize object bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
