package org.apache.maven.shared.transfer.dependencies.resolve.internal;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.Collection;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.shared.artifact.filter.resolve.TransformableFilter;
import org.apache.maven.shared.transfer.artifact.resolve.ArtifactResult;
import org.apache.maven.shared.transfer.dependencies.DependableCoordinate;
import org.apache.maven.shared.transfer.dependencies.resolve.DependencyResolverException;

/**
 * 
 * @author Robert Scholte
 *
 */
public interface MavenDependencyResolver
{

    Iterable<ArtifactResult> resolveDependencies( DependableCoordinate coordinate,
                                                  TransformableFilter dependencyFilter )
        throws DependencyResolverException;

    Iterable<ArtifactResult> resolveDependencies( Model model, TransformableFilter dependencyFilter )
        throws DependencyResolverException;

    Iterable<ArtifactResult> resolveDependencies( Collection<Dependency> mavenDependencies,
                                                  Collection<Dependency> managedMavenDependencies,
                                                  TransformableFilter filter )
        throws DependencyResolverException;

}
