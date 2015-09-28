// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package br.com.ingenieux.mojo.beanstalk.cmd.env.create;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting;
import com.amazonaws.services.elasticbeanstalk.model.OptionSpecification;
import com.amazonaws.services.elasticbeanstalk.model.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateEnvironmentContextBuilder extends
                                             CreateEnvironmentContextBuilderBase<CreateEnvironmentContextBuilder> {

  public CreateEnvironmentContextBuilder() {
    super(new CreateEnvironmentContext());
  }

  public static CreateEnvironmentContextBuilder createEnvironmentContext() {
    return new CreateEnvironmentContextBuilder();
  }

  public CreateEnvironmentContext build() {
    return getInstance();
  }
}

class CreateEnvironmentContextBuilderBase<GeneratorT extends CreateEnvironmentContextBuilderBase<GeneratorT>> {

  private CreateEnvironmentContext instance;

  protected CreateEnvironmentContextBuilderBase(
      CreateEnvironmentContext aInstance) {
    instance = aInstance;
  }

  protected CreateEnvironmentContext getInstance() {
    return instance;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withApplicationName(String aValue) {
    instance.setApplicationName(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withCnamePrefix(String aValue) {
    instance.setCnamePrefix(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withApplicationDescription(String aValue) {
    instance.setApplicationDescription(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withOptionSettings(ConfigurationOptionSetting[] aValue) {
    instance.setOptionSettings(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withOptionsToRemove(OptionSpecification[] aValue) {
    instance.setOptionsToRemove(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withEnvironmentName(String aValue) {
    instance.setEnvironmentName(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withVersionLabel(String aValue) {
    instance.setVersionLabel(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withSolutionStack(String aValue) {
    instance.setSolutionStack(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withTemplateName(String aValue) {
    instance.setTemplateName(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withEnvironmentTierName(String aValue) {
    instance.setEnvironmentTierName(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withEnvironmentTierType(String aValue) {
    instance.setEnvironmentTierType(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withEnvironmentTierVersion(String aValue) {
    instance.setEnvironmentTierVersion(aValue);

    return (GeneratorT) this;
  }

  @SuppressWarnings("unchecked")
  public GeneratorT withTags(Map<String, String> tags) {
    if (tags != null) {
      List<Tag> tagList = new ArrayList<Tag>(tags.size());
      for (String key : tags.keySet()) {
        tagList.add(new Tag().withKey(key).withValue(tags.get(key)));
      }
      instance.setTags(tagList);
    }
    return (GeneratorT) this;
  }
}
