provider "google" {
  project = "gendevby"
  region  = "europe-west1"
  zone    = "europe-west1-b"
}
terraform {
  backend "gcs" {
    bucket = "gendevby-tf-state"
    prefix = "terraforn/state"
  }
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "~> 5.27"
    }
  }
}