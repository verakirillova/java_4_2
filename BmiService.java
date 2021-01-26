public class BmiService {
    public float calculate (int weight, int height){
       float heightmeter = ((float) height)/100;
       float wight1 = (float) weight;
       float Bmi = wight1/(heightmeter*heightmeter);

       return Bmi;
 }
}
