public class TestVehicule {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture();
        Vehicule velo = new Velo();
        Vehicule moto = new Moto();

        System.out.println("***** Voiture: ******");
        voiture.demarrer();
        System.out.println("Vitesse maximale: " + voiture.getVitesseMax() + " km/h");
        voiture.arreter();

        System.out.println("\n******* Velo: *******");
        velo.demarrer();
        System.out.println("Vitesse maximale: " + velo.getVitesseMax() + " km/h");
        velo.arreter();

        System.out.println("\n******* Moto: ******");
        moto.demarrer();
        System.out.println("Vitesse maximale: " + moto.getVitesseMax() + " km/h");
        moto.arreter();
    }
}
