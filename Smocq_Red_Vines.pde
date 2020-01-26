int position=0;
void setup(){
  size(1000,1000);
}
void draw(){
  background(0);
  ellipse(position, 500, 100, 100);
  position=position+100;
}
