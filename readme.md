# Aws Lab

## Connecting to your ec2 instance
connect with the following command:
```
ssh -i "PUT PATH TO YOUR KEY HERE" ubuntu@PUT_YOUR_PUBLIC_IP_HERE
```

## Prepare your instance
- `sudo apt update`
- `sudo apt install build-essential apt-transport-https lsb-release ca-certificates curl
`
- Install java with `sudo apt install default-jre`
- Verify java is installed with `java -version`
- Install maven `sudo apt install maven`
- `curl -sL https://deb.nodesource.com/setup_12.x | sudo -E bash -`
- `sudo apt-get install -y nodejs`

## Setting up project on aws
- clone it with `git clone https://github.com/sfsu-csc-413-fall19/aws-lab.git` From inside the ec2
- cd into that directory `cd aws-lab`
- cd into react dir `cd react`
- Install it with `npm i`
- Build it with `npm run build`
- Go back up to the parent dir `cd ..`
- cd to spark with `cd spark`
- install it with `mvn install`
- build it with `mvn package`
- go to the build folder `cd target`
- run `java -jar spark-react-lab-1.0-SNAPSHOT-jar-with-dependencies.jar`

## To turn in
- Screen shot your app working with the aws ip 
- Turn off your ec2 instance as soon as you are done, you are responsible for overages!!!!!
