# XY-INC
XY-INC

TESTE DESENVOLVEDOR 2

A XY Inc. é uma empresa especializada na produção de excelentes receptores GPS (Global
Positioning System). A diretoria está empenhada em lançar um dispositivo inovador que
promete auxiliar pessoas na localização de ponto de interesse (POIs), e precisa muito de sua
ajuda.
Você foi contratado para desenvolver a plataforma que fornecerá toda a inteligência ao
dispositivo. Esta plataforma deve ser baseada em serviços, de forma a flexibilizar a integração.

Serviço para cadastrar pontos de interesse, com 3 atributos: Nome do POI, coordenada X
(inteiro não negativo) e coordenada Y (inteiro não negativo). Os POIs devem ser armazenados
em uma base de dados.

Serviço para listar todos os POIs cadastrados.

Serviço para listar POIs por proximidade. Este serviço receberá uma coordenada X e uma c
oordenada Y, especificando um ponto de referência,
em como uma distância máxima (d-
max) em metros. O serviço deverá retornar todos os POIs da base de dados que estejam a uma d
istância menor ou igual a d-max a partir do ponto de referência. Exemplo:

Base de Dados:

'Lanchonete' (x=27, y=12)
'Posto' (x=31, y=18)
'Joalheria' (x=15, y=12)
'Floricultura' (x=19, y=21)
'Pub' (x=12, y=8)
'Supermercado' (x=23, y=6)
'Churrascaria' (x=28, y=2)

Dado o ponto de referência (x=20, y=10) indicado pelo receptor GPS, e uma distância máxima d
e 10 metros, o serviço deve retornar os seguintes POIs:

Lanchonete
Joalheria
Pub
Supermercado


O que deve ser feito:

Considerações importantes:

Java 8
Maven
Spring
JPA
Hibernate
Banco MySql
AgularJs, JavaScript, Bootstrap

Seguir os seguintes passos:

1 -Criar um schema no banco mysql com o nome de " zupper "

2 - a raiz do projeto executar o seguinte comando: mvn clean package
para baixar as dependências do Java

3 - No caminho do projeto /XY-INC/xy-inc/src/main/java/com.zupper.xyinc
na classe  XyIncApplication clicar com o botão esquerdo e clicar em run

4 - Aguarde a aplicação subir e acessar a url http://localhost:8080/
