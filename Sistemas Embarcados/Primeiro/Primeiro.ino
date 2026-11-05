cons int BOTAO = 8;
boolean estado_botao;

void setup() {
  pinMode (BOTAO, INPUT);
  Serial.begin(9600);

}

void loop() {
  estado_botao = digitalRead(BOTAO);
  if (estado_botao) {
    Serial.println("Botao pressionado!!!");
  }

}
