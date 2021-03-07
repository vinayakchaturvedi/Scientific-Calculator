Scientific Calculator with DevOps:

This is a Scientific Calculator developed using various devops tools including:
Jenkins, Docker, ansible etc.

Functionalities included:
● Square root function - √x
● Factorial function - x!
● Natural logarithm (base е) - ln(x)
● Power function - x


To start the application in Dev/QA/Production host
Execute the below command.
"docker start -ai prod_calc"

ELK-STACK: For continuous monitoring
./bin/elasticsearch
./bin/kibana
.bin/logstash -f scientific_calc.conf

After executing all 3 commands go to: http://localhost:5601/ 
    -- This will lead to Kibana home page and you can start monitoring the application here.