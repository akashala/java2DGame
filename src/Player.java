import com.sun.corba.se.spi.ior.ObjectId;

import java.awt.*;
import java.util.LinkedList;

public class Player extends Sprite {

    /**
     * Creates a new Sprite object with the specified Animation.
     *
     * @param anim
     */
    public Player(Animation anim) {
        super(anim);
    }

    public void tick (LinkedList<Sprite> object){

    }

//    public void render(Graphics g){
//        g.setColor(Color.blue);
//        g.fillRect((int)x,(int)y,(int)width,(int)height);
//    }

    public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,(int)width,(int)height);
    }


}
