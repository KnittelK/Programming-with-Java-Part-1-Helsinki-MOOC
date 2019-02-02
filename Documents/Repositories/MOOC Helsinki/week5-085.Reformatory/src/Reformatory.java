public class Reformatory {
    private int measurements;
    
    public Reformatory() {
        this.measurements = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        this.measurements++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured() {
        return this.measurements;
    }

}
