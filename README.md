Scientific Calculator with DevOps:

This is a Scientific Calculator developed using various devops tools including:
Jenkins, Docker, ansible etc.

Functionalities included:
● Square root function - √x
● Factorial function - x!
● Natural logarithm (base е) - ln(x)
● Power function - x

DevOps Pipeline
The cycle will include -> Once a developer pushes the code onto a code repository CI/CD
pipeline comes into the pictures. A tool named Jenkins will build the code create a Docker
image and will perform deployment operation with the help of Ansible.

● ![DockerHub_repo](https://user-images.githubusercontent.com/37795773/111468686-db82a000-874b-11eb-9875-312285da2def.png)
![FunctionalitiesSS](https://user-images.githubusercontent.com/37795773/111468695-dd4c6380-874b-11eb-9ea7-92614f329c99.png)
![Jenkins_pipeline1](https://user-images.githubusercontent.com/37795773/111468699-df162700-874b-11eb-8285-ea55f0943fb5.png)
![Jenkins_pipeline2](https://user-images.githubusercontent.com/37795773/111468707-e0dfea80-874b-11eb-8134-6d319d37c57b.png)
![Jenkins_pipeline3](https://user-images.githubusercontent.com/37795773/111468717-e2a9ae00-874b-11eb-8132-28f90e8a160f.png)
![Jenkins_Pipeline_build](https://user-images.githubusercontent.com/37795773/111468729-e4737180-874b-11eb-8294-e6f7e7e26805.png)
![Screenshot from 2021-03-17 15-04-19](https://user-images.githubusercontent.com/37795773/111468756-eb01e900-874b-11eb-814e-648e91441e96.png)
Development IDE: Intellij
● Language: JAVA
● SCM – GitHub - ​ https://github.com/vinayakchaturvedi/Scientific-Calculator
● Building and Packaging – Maven
● Docker image -
● https://hub.docker.com/repository/docker/vinayak96/scientific_calculator
● Continuous Integration – Jenkins
● Continuous Deployment – Ansible
● Continuous Monitoring – ELK Stack

To start the application in Dev/QA/Production host
Execute the below command.
"docker start -ai prod_calc"

ELK-STACK: For continuous monitoring
./bin/elasticsearch
./bin/kibana
.bin/logstash -f scientific_calc.conf

After executing all 3 commands go to: http://localhost:5601/ 
    -- This will lead to Kibana home page and you can start monitoring the application here.
