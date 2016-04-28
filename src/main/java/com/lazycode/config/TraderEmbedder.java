package com.lazycode.config;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.StoryReporterBuilder.Format;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.SilentStepMonitor;

import com.prodigy.steps.MySteps;


public class TraderEmbedder extends Embedder {
 
    @Override
    public EmbedderControls embedderControls() {
        return new EmbedderControls().doIgnoreFailureInStories(true).doIgnoreFailureInView(true);
    }
 
    @SuppressWarnings("deprecation")
	@Override
    public Configuration configuration() {
        Class<? extends TraderEmbedder> embedderClass = this.getClass();
        return new MostUsefulConfiguration()
            .useStoryLoader(new LoadFromClasspath(embedderClass.getClassLoader()))
            .useStoryReporterBuilder(new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(embedderClass))
                .withDefaultFormats()
                .withFormats(Format.HTML)
                .withCrossReference(new CrossReference()))
            .useStepMonitor(new SilentStepMonitor());                               
    }
 
    @Override
    public InjectableStepsFactory stepsFactory() {
    	return new InstanceStepsFactory(configuration(), new MySteps());
    }
 
}