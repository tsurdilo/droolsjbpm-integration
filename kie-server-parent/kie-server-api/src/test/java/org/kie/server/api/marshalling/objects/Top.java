/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.server.api.marshalling.objects;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Top implements Serializable {

    private static final long serialVersionUID = -4160586449338947038L;

    private NestedLevel1 nestedLevel1;

	public NestedLevel1 getNestedLevel1() {
		return nestedLevel1;
	}

	public void setNestedLevel1(NestedLevel1 nestedLevel1) {
		this.nestedLevel1 = nestedLevel1;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nestedLevel1 == null) ? 0 : nestedLevel1.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Top other = (Top) obj;
        if (nestedLevel1 == null) {
            if (other.nestedLevel1 != null)
                return false;
        } else if (!nestedLevel1.equals(other.nestedLevel1))
            return false;
        return true;
    }

}
