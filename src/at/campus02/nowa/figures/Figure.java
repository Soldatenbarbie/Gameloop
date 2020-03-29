package at.campus02.nowa.figures;

public abstract class Figure {
    protected int faktor;
    protected char[][] symbol = new char[3][3];

    protected Figure(int faktor){
        this.faktor = faktor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < symbol.length; i++){
            for ( int j = 0; j < symbol[i].length; j++ ){

                sb.append(symbol[i][j]);

            }
            //hier kommt line break hin

            sb.append("\r\n");
        }

        //TODO: Implementieren der Ausgabe in einen StringBuilder

        return sb.toString();
    }
}
