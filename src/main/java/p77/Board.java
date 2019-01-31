package p77;

public class Board {
  Shape [] body=new Shape[4];
  public void delete(int i){
      if(body[i]!=null){
          String delFigure=body[i].getName();
          body[i]=null;
          System.out.println("Shape "+delFigure+" delete with "+i+" cell");
      }
      else{System.out.println(i+" cell epty");}

  }
public void push(Shape a){

    for(int i=0;i<body.length;i++){
        if (body[i]==null){body[i]=a;
            System.out.println("Shape "+a.getName()+" added to "+i+" cell");
        break;}
        else if (i==3){System.out.println("All cells are full");}
}
}
public void allShapeAreaOnBoard(){
    int areaAll=0;
    String shapes="";
    for(int i=0;i<body.length;i++){
       if (body[i]!=null){
        areaAll+=body[i].calculateArea();
        shapes+=" "+body[i].getName();
    }}
    System.out.println("Shapes- "+shapes+"  "+ areaAll);
}
    public static void main(String[] args) {
    Shape sd=new Square(2);
    Board fg=new Board();
    fg.push(sd);
        fg.push(sd);
        fg.push(sd);
        fg.delete(1);

        fg.allShapeAreaOnBoard();

    }
}
