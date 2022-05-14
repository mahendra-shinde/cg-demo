# Kubernetes deployment

1. Create [deploy.yaml](./deploy.yaml) and [services.yaml](./service.yaml)

2.  Deploy them using kubectl

```
 kubectl apply -f deploy.yaml
 kubectl apply -f services.yaml
 kubectl get po 
 kubectl logs -l app=book-api
 kubectl logs -l app=student-api
```

## Kubernetes Commands to be used

Command | Description
--------|----------------------
kubectl get no | List all the worker nodes from Kubernetes cluster
kubectl  apply -f deploy.yaml | Deploy the manifest (YAML) into cluster
kubectl  apply -f services.yaml | Deploy the manifest (YAML) into cluster
kubectl get po | List all running pods (Pod is wrapper for container)
kubectl logs -l app=book-api | View logs of "book-api" deployment
kubectl logs -l app=student-api | View logs of "student-api" deployment