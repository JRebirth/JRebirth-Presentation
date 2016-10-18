/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF Any KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.af.presentation.jaf.resources;

import static org.jrebirth.af.core.resource.Resources.create;

import org.jrebirth.af.api.resource.image.ImageExtension;
import org.jrebirth.af.api.resource.image.ImageItem;
import org.jrebirth.af.core.resource.image.RelImage;

/**
 * The JpImages interface providing all images.
 */
public interface JpImages {

    /** The background image used by place slide. */
    ImageItem PLACE_BG = create(new RelImage("intro", "Geneve_Lac_Leman", ImageExtension.JPG));

    /** The logo displayed into each slide. */
    ImageItem JREBIRTH_LOGO = create(new RelImage("JRebirth_Title_Mini", ImageExtension.PNG));

    /** The logo displayed as application icon. */
    ImageItem JR_LOGO = create(new RelImage("JRebirth_256x256", ImageExtension.PNG));

}
