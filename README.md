# Plastic-Classification-
Plastic classification for recycling, based on Computer Vision algorithms and Neural Networks.
## Remember before use 
![Say no to plastic](assets/dolphin.gif)
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

#### ORCA APK


#### Start using ORCA

To use ORCA application, click on "Start From Here and Save Your Planet" button then click on "Select Photo". 
You can choose a photo for any plastic product from your gallery or take a photo using your mobile camera. 
A ListView will show up multiple fields (Type of plastic, health concern, Recyclability,....), that you can click on any specific field and raise your awareness about our environment, the marine life, health issues and more and more helpful information. 

#### Dependencies used for developing ORCA

- java-sdk 6.2.0

- firebase-database:16.0.4

- firebase-firestore:18.2.0


### 2. Firebase Database
Firebase is an online platform  that we use to store our data.
Our Data is retrieved on a realtime basis, making it easy to modify or update its content, also making the application lighter.
The Data is organized in a collection named __Plastic Types__, which has multiple unique documents for each supported product.
![](assets/IPPSC1) 
Each Product has multiple fields:

    a. Intro
    b. Type of plastic
    c. Number
    d. Recyclability
    e. Recycled Into
    f. Similar Products
    g. How To Use It Less
    f. Single-use
    g. If Used More Than Once
    h. Health Concern
 
### 4. Computer Vision Techniques
we apply computer vision techniques before classifying 
  1. Image Resizing
  2. Image denoising
  3. Increasing brightness 
  4. Increasing contrasts 
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
#### 4. Training
Training is done on colab [notebook](https://drive.google.com/open?id=1A7WDR2371HpOgmr-j3OBiYwr5bX0YIu7)
unfortunately after 3 days of labeling and training it didn't give good results

So we used the same data and trained a custom visual recognition model on [ibm watson](https://www.ibm.com/watson) and the results and accuracy were high enough to rely on it 

The input to the model is captured using mobiles's camera then it's preprocessed before classification 
