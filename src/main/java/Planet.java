public class Planet {

    private String name;
    private int size;

    public Planet(String _name, int _size){
        this.name = _name;
        this.size = _size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void printExplode(){
        System.out.println("Boom! " + this.name + " has exploded.");
    }
}
