/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author SMK TELKOM
 */
public class rect {
    public int x1,x2,y1,y2;
    
    public rect(int x1,int y1,int x2,int y2){
    this.x1=x1;
    this.x2=x2;
    this.y1=y1;
    this.y2=y2;
    }
    public rect(int width,int height){
    this(0,0,width,height);
    }
    public rect(){
        this(0,0,0,0);
    }
            public void move(int deltax,int deltay)
{
x1+=deltax; x2+=deltax;
y1+= deltay; y2+=deltay;

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean isInside(int x, int y){
  return((x >= x1) && (x <= x2) && (x <= y1) && (x <= y2));   
}
 public rect union(rect r){
     return new rect
             ( (this.x1<r.x1) ? this.x1 : r.x1,
               (this.x2<r.x2) ? this.x2 : r.x2,
               (this.y1>r.y1) ? this.x1 : r.y1,
               (this.y2>r.y2) ? this.y2 : r.y2);
             
            
 }
 public rect intersection(rect r){
     rect result=new rect(
        
                (this.x1>r.x1) ? this.x1 : r.x1,
                (this.x2>r.x2) ? this.x2 : r.x2,
                (this.y1<r.y1) ? this.x1 : r.y1,
                (this.y2<r.y2) ? this.y2 : r.y2);
     if(result.x1>result.x2){
       result.x1=result.x2=0;  
     }
     if(result.y1>result.y2){
       result.y1=result.y2=0;
     }
     /*return result;*/
 

 


