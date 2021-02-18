# Microservices-with-Spring-Cloud-V2

https://github.com/spring-cloud/spring-cloud-config
https://cloud.spring.io/spring-cloud-config/reference/html/

### URL and Response Structure for Currency Exchange Service

We will make use of these in the next lecture!
URL
http://localhost:8000/currency-exchange-service/from/USD/to/INR

Response Structure

    {
       "id":10001,
       "from":"USD",
       "to":"INR",
       "conversionMultiple":65.00,
       "environment":"8000 instance-id"
    }
	
### Currency Exchange Service
http://localhost:8000/currency-exchange/from/USD/to/INR

### Currency Conversion Service
http://localhost:8101/currency-conversion/from/USD/to/INR/quantity/10

### URL
http://localhost:8101/currency-conversion/from/USD/to/INR/quantity/10

Response Structure

    {
      "id": 10001,
      "from": "USD",
      "to": "INR",
      "conversionMultiple": 65.00,
      "quantity": 10,
      "totalCalculatedAmount": 650.00,
      "environment": "8000 instance-id"
    }

### EUREKA SERVER
http://localhost:8761

### API GATEWAY
http://localhost:8765
localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/EURO/to/CFA
localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/EURO/to/CFA/quantity/12
localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/EURO/to/CFA/quantity/12

localhost:8765/currency-exchange/currency-exchange/from/EURO/to/CFA
localhost:8765/currency-conversion/currency-conversion-feign/from/EURO/to/CFA/quantity/12
localhost:8765/currency-conversion/currency-conversion/from/EURO/to/CFA/quantity/12

     