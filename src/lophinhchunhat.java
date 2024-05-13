public class lophinhchunhat {
    double width,height;
    public lophinhchunhat(){

    }
    public lophinhchunhat(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double Area(){
        return this.width * this.height;
    }
    public double getPrimeter(){
        return (this.width * this.height)*2;

    }
    public String display(){
        return "lophinhchunhat{"+ "width=" + width +"height=" + height + "}";
    }
}

