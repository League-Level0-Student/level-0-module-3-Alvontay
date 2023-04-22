
void setup() {
 
  // set the size of your sketch
  size(500,500);
  noStroke();
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 7; i > 0; i--) {
    if (i % 2  == 0) {
      fill(#016389);
    } else {
      fill(#EA9A05);
    }
     ellipse(250,250,i * 70,i * 70);
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
