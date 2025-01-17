/*
 *  Copyright 2013 National Technical University of Athens
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
 
package eu.sociosproject.sociosapi.server.update.events;

import java.io.Serializable;

import eu.sociosproject.sociosvoc.ObjectId;

public class SociosEvent implements Serializable{
	private static final long serialVersionUID = 1L;
	
	TargetType targetType;
	ObjectId id;
	Object target;
	
	public SociosEvent() {
		super();
	}	
	
	public SociosEvent(TargetType targetType, ObjectId id, Object target) {
		super();
		this.targetType = targetType;
		this.id = id;
		this.target = target;
	}
	public TargetType getTargetType() {
		return targetType;
	}
	public void setTargetType(TargetType targetType) {
		this.targetType = targetType;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	
	
}

