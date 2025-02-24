public class Main {
    public static void main(String[] args) {
        Institution institution = new Institution("Institution de recherche en science de la sante (IRSS)", "RD Congo", "Public", 1982);

        System.out.println("****** Description de l'institution: ********* \n");
        institution.decrireInstitution();
        System.out.println();

        Universite universite1 = new Universite("Université libre des pays de grands lacs", "RD Congo", "Public", 1985, 7, "LMD", "Professeur ordinaire WASSO MISOMA");
        Universite universite2 = new Universite("Université de goma", "RD Congo", "Public", 1993, 8, "LMD", "MUHINDO MUGHANDA");

        
        System.out.println("********* Description des universités: ************ \n");
        universite1.decrireUniversite();
        System.out.println();

        universite2.decrireUniversite();
        System.out.println();

        System.out.println("********** Noms des recteurs des universités: ***********\n");
        Universite.afficherNomsRecteurs(universite1, universite2);
        System.out.println();

        Ecole ecole1 = new Ecole("Collège mwanga", "RD Congo", "PUBLIC", 1963, "Secondaire", 50, "MR.BUSINGA JOSEPH");
        Ecole ecole2 = new Ecole("Institut metanoia","RD Congo", "PRIVEE", 1968, "Secondaire", 50, "MR. ALEXANDRE KIWIWI");
        Ecole ecole3 = new Ecole("Ecole Primaire KAUTA", "RD Congo", "Privée", 2005, "Primaire", 40, "Madame esther ");

        System.out.println("********** Description des écoles: *************\n");
        ecole1.decrireEcole();
        System.out.println();

        ecole2.decrireEcole();
        System.out.println();

        ecole3.decrireEcole();
        System.out.println();

        System.out.println("****** Noms des promoteurs des écoles: ********\n");
        Ecole.afficherNomsPromoteurs(ecole1, ecole2, ecole3);
    }
}
