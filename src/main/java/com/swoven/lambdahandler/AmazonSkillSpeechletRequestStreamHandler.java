package com.swoven.lambdahandler;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;
import com.swoven.controller.AlexaSpeechlet;

public final class AmazonSkillSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler{
	
	private static final Set<String> supportedApplicationIds;
    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds = new HashSet<String>();
        supportedApplicationIds.add("amzn1.ask.skill.9fe2dd42-a13f-411d-922b-904503c75213");
    }
    
    public AmazonSkillSpeechletRequestStreamHandler() {
    		super(new AlexaSpeechlet(), supportedApplicationIds);
    }
    
}