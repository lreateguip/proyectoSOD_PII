package com.execute.aws;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.AmazonKinesisClientBuilder;

public class AwsKinesisClient {

    public static final String AWS_ACCESS_KEY = "aws.accessKeyId";
    public static final String AWS_SECRET_KEY = "aws.secretKey";
    public static final String AWS_SESSION_TOKEN = "aws.sessionToken";
    
    public static final String ACCESS_KEY_REATEGUI = "ASIAY27HW4YPULBXAFNU";
    public static final String SECRET_KEY_REATEGUI = "qQaC3iNRC8PkC3CcYfFySV44+VeqHfwKY5rEkxGi";
    public static final String SESSION_TOKEN_REATEGUI = "FwoGZXIvYXdzEC0aDBRxzCukpmISY4hudSLIATS9TOZuUO2Z/A3QLDmKVOifE5X2ZFiqXajnMv8Xa4QgjvOhWVBW05qIyAeb+zM0/doxvUHBQ3xmYnNCILjiPPNlIJiz0lRiyhRrh6zKJkoA05l+S4fiFgh7KccOFeX6o31zURNwMlVULkNZRV9IX4pD9rP5WCNHvaYml7be2CmrkwrroSGnc20qCrVgFKWjxphucGOflq4DPl1lKT16iU/N0hxLH1ghs7snk/xUBRxvKUFO9+m9AXCurz53O+rZ8oZEsnJQFtfdKOXYhPwFMi2mIl1Lg8x9V3V/H7Y+eDUPE6rBI6qG94UlGJzzr5zHiYNo0LKCm3e1/4w/CZk=";
    
    public static final String ACCESS_KEY_INTRIAGO = "ASIARK6SI2JJ457RBLEN";
    public static final String SECRET_KEY_INTRIAGO = "T9A2KBM0UGUlHaCym9J+dJ0rFwvmCHRdAkiYqMGU";
    public static final String SESSION_TOKEN_INTRIAGO = "FwoGZXIvYXdzEIP//////////wEaDBDHSfrJWUZ+mZ3PlSLDAT5X5l1JBTBv5L+dhtvCeV3kGr4foV6qSzeE9puseFA/7X3C/1YRowV1+pUxTGuIx1fyu7rtptj0e9QWlN4dIkpkwyfhpIfw9wXZZ8xgtwXQtoQ6BDftmlHxOiUmfQTggBxj53eB8V/z6ZIh568e0+9IBp2Ved0PHUQ1kYNywIWczfeK4+cBV8uTDgtvsLK1E3ZPd4VR/Hl5nqicpWQ9V/ul8HMgBT+phZE2d/QE3hK2C1UP1o7QIIJB+5vIqz2WnuNQQSjKoN/7BTItaEwBD6BjCMQtefhuirD3fM/vOVoZsA3Ss//AT6QTP1SP03K/uxbP5rA92ls/";
    static {
        //add your AWS account access key and secret key
        System.setProperty(AWS_ACCESS_KEY, ACCESS_KEY_REATEGUI);
        System.setProperty(AWS_SECRET_KEY, SECRET_KEY_REATEGUI);
        System.setProperty(AWS_SESSION_TOKEN, SESSION_TOKEN_REATEGUI);
//        
//        System.setProperty(AWS_ACCESS_KEY, ACCESS_KEY_INTRIAGO);
//        System.setProperty(AWS_SECRET_KEY, SECRET_KEY_INTRIAGO);
//        System.setProperty(AWS_SESSION_TOKEN, SESSION_TOKEN_INTRIAGO);
    }

    public static AmazonKinesis getKinesisClient(){
        return AmazonKinesisClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .build();
    }
}