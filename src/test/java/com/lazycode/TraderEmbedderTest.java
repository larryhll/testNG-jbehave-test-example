package com.lazycode;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStory;
import org.testng.annotations.Test;

import com.prodigy.config.TraderEmbedder;

public class TraderEmbedderTest extends JUnitStory{
    
	@Test
    public void runClasspathLoadedStoriesAsJUnit() {
        Embedder embedder = new TraderEmbedder();
        List<String> storyPaths = new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()), "**/*.story", "");
        embedder.runStoriesAsPaths(storyPaths);
    }

}