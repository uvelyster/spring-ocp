# spring-ocp

## Install S2i
curl -sSL https://github.com/openshift/source-to-image/releases/download/v1.3.1/source-to-image-v1.3.1-a5a77147-linux-amd64.tar.gz -o s2i.tar.gz  
tar xvzf s2i.tar.gz  
mv s2i /usr/bin/   
rm s2i*   

## Install docker
curl https://download.docker.com/linux/centos/docker-ce.repo > /etc/yum.repos.d/docker.repo  
yum install -y docker-ce  
systemctl start docker ; systemctl enable docker  


## environment-dependent property management
https://www.openshift.com/blog/environment-dependent-property-management-strategies-openshift-pipelines

## Build s2i-builder image for gradle
