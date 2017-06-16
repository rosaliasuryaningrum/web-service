/**
 * @(#)PostsFromPageExtractor.java
 *
 * PostsFromPageExtractor application
 *
 * @author 
 * @version 1.00 2017/5/25
 */
 
import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("128789587672839", "48706e5daaff3afa8d912c81b53743dc");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBAJaygNA8Hha5EpJiVlapkgykIcw1lwxeyJhBdnmdN1uu8QnnjmDueZBppNgL8Q48LraoCU43SO6ZCMEnew2KM4cZBV1oYcM1QtEdZCPVBCcEGizlOompHlNQuyZC1D16FFXqBN88ZBBPUKSkl2kPFUNPlhtuDzTdE2ZBveapjEgE63yyPF5ABQZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
            facebook.postStatusMessage("Hello World from Facebook4J.");
        }           
    }
