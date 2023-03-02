package dev.batuhansener.java.tutorial.oofp.nestedClass.staticNested;

public class citizen {

    private String name;
    private int no;
    private nationality nationality;

    public citizen(String name, int no, citizen.nationality nationality) {
        this.name = name;
        this.no = no;
        this.nationality = nationality;
    }

    @Override
    public String toString(){
        return name+" \n"+no+" \n"+nationality.country+" \n"+nationality.abbreviation;
    }

    static class nationality{
        private String country;
        private String abbreviation;

        public nationality(String country, String abbreviation){
            this.abbreviation = abbreviation;
            this.country = country;
        }
    }
}
