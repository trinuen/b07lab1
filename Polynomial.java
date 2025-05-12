public class Polynomial{

  double [] poly;
  
  public Polynomial(){
    poly = new double[0];
  }

  public Polynomial(double[] coeffs){
    poly = coeffs;

  }

  public Polynomial add(Polynomial q){

    double[] temp;
    int min = Math.min(poly.length, q.poly.length);
    
    if (poly.length > q.poly.length){
      for (int i=0; i<min; i++){
        poly[i] += q.poly[i];
      }

      temp = new double[poly.length];
      for(int i=0; i<poly.length; i++){
        temp[i] = poly[i];
      }
    }

    else{
      for (int i=0; i<min; i++){
        q.poly[i] += poly[i];
      }

      temp = new double[q.poly.length];
      for(int i=0; i<q.poly.length; i++){
        temp[i] = q.poly[i];
      }
    }

    Polynomial result = new Polynomial(temp);
    return result;
  }

  public double evaluate(double x){
    double result = 0;
    for (int i=0; i<poly.length; i++){
      result += poly[i] * Math.pow(x, i);
    }
    return result;
  }

  public boolean hasRoot(double x){
    return evaluate(x) == 0;
  }

}

