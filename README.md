# Getting Started
This is a Bare minimum implementation to setup and scale an app based on custom Metric being Written in MyBean.java

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/#build-image)
* [Prometheus](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#actuator.metrics.export.prometheus)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#actuator)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Setup cluster

'''gcloud beta container --project "{GCP_PROJECT_ID}" clusters create "cluster-1" --no-enable-basic-auth --cluster-version "1.25.12-gke.500" --release-channel "None" --machine-type "e2-small" --image-type "COS_CONTAINERD" --disk-type "pd-balanced" --disk-size "100" --metadata disable-legacy-endpoints=true --scopes "https://www.googleapis.com/auth/devstorage.read_only","https://www.googleapis.com/auth/logging.write","https://www.googleapis.com/auth/monitoring","https://www.googleapis.com/auth/servicecontrol","https://www.googleapis.com/auth/service.management.readonly","https://www.googleapis.com/auth/trace.append" --num-nodes "2" --logging=SYSTEM,WORKLOAD --monitoring=SYSTEM --enable-ip-alias --network "projects/{GCP_PROJECT_ID}/global/networks/default" --subnetwork "projects/{GCP_PROJECT_ID}/regions/europe-west1/subnetworks/default" --no-enable-intra-node-visibility --default-max-pods-per-node "110" --security-posture=disabled --workload-vulnerability-scanning=disabled --no-enable-master-authorized-networks --addons HorizontalPodAutoscaling,HttpLoadBalancing,GcePersistentDiskCsiDriver --enable-autoupgrade --enable-autorepair --max-surge-upgrade 1 --max-unavailable-upgrade 0 --binauthz-evaluation-mode=DISABLED --no-enable-managed-prometheus --enable-shielded-nodes --region "europe-west1-c"

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

