/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2016-12-18 12:17:12                         ---
 * ----------------------------------------------------------------
 */
package com.beforeship.jalo;

import com.beforeship.constants.BugStoreFrontConstants;
import com.beforeship.jalo.BugComment;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Bug}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBug extends GenericItem
{
	/** Qualifier of the <code>Bug.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Bug.severity</code> attribute **/
	public static final String SEVERITY = "severity";
	/** Qualifier of the <code>Bug.assigned</code> attribute **/
	public static final String ASSIGNED = "assigned";
	/** Qualifier of the <code>Bug.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Bug.bugComments</code> attribute **/
	public static final String BUGCOMMENTS = "bugComments";
	/**
	* {@link OneToManyHandler} for handling 1:n BUGCOMMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BugComment> BUGCOMMENTSHANDLER = new OneToManyHandler<BugComment>(
	BugStoreFrontConstants.TC.BUGCOMMENT,
	false,
	"bug",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(SEVERITY, AttributeMode.INITIAL);
		tmp.put(ASSIGNED, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.assigned</code> attribute.
	 * @return the assigned
	 */
	public String getAssigned(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ASSIGNED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.assigned</code> attribute.
	 * @return the assigned
	 */
	public String getAssigned()
	{
		return getAssigned( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.assigned</code> attribute. 
	 * @param value the assigned
	 */
	public void setAssigned(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ASSIGNED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.assigned</code> attribute. 
	 * @param value the assigned
	 */
	public void setAssigned(final String value)
	{
		setAssigned( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.bugComments</code> attribute.
	 * @return the bugComments
	 */
	public Collection<BugComment> getBugComments(final SessionContext ctx)
	{
		return BUGCOMMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.bugComments</code> attribute.
	 * @return the bugComments
	 */
	public Collection<BugComment> getBugComments()
	{
		return getBugComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.bugComments</code> attribute. 
	 * @param value the bugComments
	 */
	public void setBugComments(final SessionContext ctx, final Collection<BugComment> value)
	{
		BUGCOMMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.bugComments</code> attribute. 
	 * @param value the bugComments
	 */
	public void setBugComments(final Collection<BugComment> value)
	{
		setBugComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bugComments. 
	 * @param value the item to add to bugComments
	 */
	public void addToBugComments(final SessionContext ctx, final BugComment value)
	{
		BUGCOMMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bugComments. 
	 * @param value the item to add to bugComments
	 */
	public void addToBugComments(final BugComment value)
	{
		addToBugComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bugComments. 
	 * @param value the item to remove from bugComments
	 */
	public void removeFromBugComments(final SessionContext ctx, final BugComment value)
	{
		BUGCOMMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bugComments. 
	 * @param value the item to remove from bugComments
	 */
	public void removeFromBugComments(final BugComment value)
	{
		removeFromBugComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.severity</code> attribute.
	 * @return the severity
	 */
	public EnumerationValue getSeverity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEVERITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.severity</code> attribute.
	 * @return the severity
	 */
	public EnumerationValue getSeverity()
	{
		return getSeverity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.severity</code> attribute. 
	 * @param value the severity
	 */
	public void setSeverity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEVERITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.severity</code> attribute. 
	 * @param value the severity
	 */
	public void setSeverity(final EnumerationValue value)
	{
		setSeverity( getSession().getSessionContext(), value );
	}
	
}
