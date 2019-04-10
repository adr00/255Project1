public class Mammals extends Animals {
    private String hairtype;
    private Boolean thumb;
    private Boolean isNoctournal;

    public Mammals(){
        hairtype = "$$$";
        thumb = false;
        isNoctournal = false;
    }

    public Mammals(String ht, Boolean t, Boolean n){
        hairtype = ht;
        thumb = t;
        isNoctournal = n;
    }

    public String getHairtype() {
        return hairtype;
    }

    public void setHairtype(String hairtype) {
        this.hairtype = hairtype;
    }

    public Boolean getNoctournal() {
        return isNoctournal;
    }

    public void setNoctournal(Boolean noctournal) {
        isNoctournal = noctournal;
    }

    public Boolean getThumb() {
        return thumb;
    }

    public void setThumb(Boolean thumb) {
        this.thumb = thumb;
    }
}
