# Plastic-Classification-
Plastic classification for recycling, based on Computer Vision algorithms and Neural Networks.
## Remember before use 
![Say no to plastic](dolphin.gif)
## Project Goal
The main goal of our application is to raise awareness of plastic hazards
we want to encourage people to stop using plastics for good. If we don’t act now, by the year 2050 there will be more plastic in the ocean than fish.

Facts about the plastic hazards
1. Plastics do not Biodegrade, and never fully Degrade
2. Scientists estimate that 1 million seabirds and 100,000 marine mammals die each year from ingesting plastic. 
3. When plastic does make it into the ocean it breaks down into smaller and smaller pieces known as “microplastics” rather than biodegrading or dissolving, which poses great threats to marine life including fish.
![](https://get-green-now.com/wp-content/uploads/2018/01/Microplastic-compressor.jpg)


## Project Architecture
### 1. Android Application
### 2. Firebase Database
### 4. Computer Vision Techniques
we apply computer vision techniques before classifying 
  1. Image Resizing
  2. Image denoising
  3. Image normalization 
  4. increasing contrasts 
### 5. Classification
first, we went to the object detection and classification approach with the aid of [Tony object detection demo](https://github.com/Tony607/object_detection_demo) , it required several steps
#### 1. Specifying classes 
Based on research we found that the most used and environment endagering plastics are water bottles, plastic bags, plastic,  silverware (fork , knife and spoons ), shampoo and detergent bottles, plastic cups, coffee lids, straws, plastic plates and bottle  caps
#### 2. Data collection
Most of the data are collected from shutterstock and google image.
after collecting we filtered the data to make sure that it's convenient to the classes.
#### 3. Image labelling 
Done with [labelimg](https://github.com/tzutalin/labelImg)
#### 5. Data preprocessing 
Data preprocessing before training is a must 
we filtered the images and resized all the data to (600,800) 
#### 4. Trainning
Training is done on colab [notebook](https://drive.google.com/open?id=1A7WDR2371HpOgmr-j3OBiYwr5bX0YIu7)
unfortunately after 3 days of labeling and training it didn't give good results

So we used the same data and trained a custom visual recognition model on [ibm watson](https://www.ibm.com/watson) and the results and accuracy were high enough to rely on it 

The input to the model is captured using mobiles's camera then it's preprocessed before classification 
