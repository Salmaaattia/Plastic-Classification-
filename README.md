# Plastic-Classification-
Plastic classification for recycling, based on Computer Vision algorithms and Neural Networks.
## Project Goal

## Project Architecture
### 1. Android Application
### 2. Firebase Database
### 4. Computer Vision Techniques
### 5. Classification
first, we went to the object detection and classification approach with the aid of [Tony object detection demo](https://github.com/Tony607/object_detection_demo) , it required several steps
#### 1. specifying classes 
based on research we found that the most used and environment endagering plastics are water bottles, plastic bags, plastic,  silverware (fork , knife and spoons ), shampoo and detergent bottles, plastic cups, coffee lids, straws, plastic plates and bottle  caps
#### 2. data collection
most of the data are collected from shutterstock and google image.
after collecting we filtered the data to make sure that it's convenient to the classes.
#### 3. image labelling 
done with [labelimg](https://github.com/tzutalin/labelImg)
#### 5. data preprocessing 
data preprocessing before training is a must 
we filtered the images and resized all the data to (600,800) 
#### 4. trainning
training is done on colab [notebook](https://drive.google.com/open?id=1A7WDR2371HpOgmr-j3OBiYwr5bX0YIu7)
unfortunately after 3 days of labeling and training it didn't give good results

so we used the same data and trained a custom visual recognition model on [ibm watson](https://www.ibm.com/watson) and the results and accuracy were high enough to rely on it 

the input to the model is captured using the phone's camera then it's preprocessed before classification 
