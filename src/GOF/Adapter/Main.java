package GOF.Adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(20);
        RoundPeg rpeg = new RoundPeg(6);

        if(hole.fits(rpeg)){
            System.out.println("Pino redondo de "+  rpeg.getRadius() + " radius entra no buraco de " + hole.getRadius());
        }
        else{
            System.out.println("Pino redondo de "+  rpeg.getRadius() + " radius não entra no buraco de " + hole.getRadius());
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
