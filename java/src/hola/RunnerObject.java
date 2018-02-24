package hola;

public class RunnerObject extends WorldObject {

    public RunnerObject(){
        super(TypeObjet.RUNNER, new SVector3d());
    }

    public RunnerObject(SVector3d position) {
        this();
        this.setPosition(position);
    }
}
