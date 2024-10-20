import greenfoot.*;

public class AvatarManager extends Actor {

  private Queue<Avatar> avatars = new Queue<>();

  private Avatar current;

  public AvatarManager() {
    setImage((GreenfootImage) null);

    avatars.enqueue(new Avatar("images/face_a.png"));
    avatars.enqueue(new Avatar("images/face_b.png"));
    avatars.enqueue(new Avatar("images/face_c.png"));

    current = avatars.dequeue();

  }