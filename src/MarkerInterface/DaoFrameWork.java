package MarkerInterface;

public class DaoFrameWork {
    public void delete(Object object){
        if(object instanceof Deletable){
            System.out.println("deleted");
        }
    }
}
