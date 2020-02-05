package jdulal.com.np.androiduploadretrieveimagesusingfirebasestorage;

public class MyModel {
    private String imgName;
    private String imgDescription;
    private String imgUrl;

    public MyModel() {
    }

    public MyModel(String imgName, String imgDescription, String imgUrl) {
        if(imgName.trim().equals("") && imgDescription.trim().equals(""))
        {
            imgName="No name";
            imgDescription="No description";
        }
        this.imgName = imgName;
        this.imgDescription = imgDescription;
        this.imgUrl = imgUrl;
    }

    /*public MyModel(String imgName, String imgUrl) {
        if(imgName.trim().equals(""))
        {
            imgName="No name";
        }
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }*/

    public String getImgDescription() {
        return imgDescription;
    }

    public void setImgDescription(String imgDescription) {
        this.imgDescription = imgDescription;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
